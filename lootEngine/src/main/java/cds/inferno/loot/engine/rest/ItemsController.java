package cds.inferno.loot.engine.rest;

import cds.inferno.loot.engine.dto.ItemDto;
import cds.inferno.loot.engine.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/items")
public class ItemsController {

	@Autowired
	private ItemService itemService;

	@GetMapping("/")
	public List<ItemDto> getAllTheItems() {
		return itemService.getAllItems();
	}

	@GetMapping("/{id}")
	public ResponseEntity getSpecificItems(@PathVariable("id") Long id) {
		if(null == id){
			Map<String, String> map = new HashMap<>();
			map.put("code", "NO_ITEM_FOUND");
			map.put("message", "This item does not exist");
			return new ResponseEntity<>(map, HttpStatus.BAD_REQUEST);
		}
		ItemDto dto = itemService.findItemById(id);
		if(null == dto){
			Map<String, String> map = new HashMap<>();
			map.put("code", "NO_ITEM_FOUND");
			map.put("message", "This item does not exist");
			return new ResponseEntity<>(map, HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(dto, HttpStatus.FOUND);
	}

	@GetMapping("/findByCriteria")
	public ResponseEntity findItemsByCriteria(@RequestBody ItemDto search){
		if(null == search){
			List<ItemDto>itemDtoList = itemService.getAllItems();
			return new ResponseEntity<>(itemDtoList, HttpStatus.OK);
		}
		List<ItemDto> itemDtoList = itemService.findSpecificItems(search);
		if(null == itemDtoList || itemDtoList.isEmpty()){
			Map<String, String> map = new HashMap<>();
			map.put("code", "NO_ITEM_FOUND");
			map.put("message", "Your search might be too specific");
			return new ResponseEntity<>(map, HttpStatus.EXPECTATION_FAILED);
		}
		return new ResponseEntity<>(itemDtoList,HttpStatus.FOUND);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity deleteItem(
			@PathVariable(value = "id", required = true) Long id){
		try{
			itemService.deleteItem(id);
		}catch (IllegalArgumentException iae){
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(HttpStatus.OK);
	}

	@PostMapping("/save")
	public ResponseEntity saveItem(@RequestBody ItemDto input){
		if(null == input){
			Map<String, String> map = new HashMap<>();
			map.put("code", "INPUT_NULL");
			map.put("message", "The input can't be null");
			return new ResponseEntity<>(map, HttpStatus.NO_CONTENT);
		}
		if(null != input.getId()){
			Map<String, String> map = new HashMap<>();
			map.put("code", "ALREADY_EXIST");
			map.put("message", "You are trying to create an already exisiting item");
			return new ResponseEntity<>(map, HttpStatus.BAD_REQUEST);
		}
		itemService.saveItem(input);
		return new ResponseEntity(HttpStatus.CREATED);
	}

	@PostMapping("/update")
	public ResponseEntity updateItem(@RequestBody ItemDto input){
		if(null == input){
			Map<String, String> map = new HashMap<>();
			map.put("code", "INPUT_NULL");
			map.put("message", "The input can't be null");
			return new ResponseEntity<>(map, HttpStatus.NO_CONTENT);
		}
		if(null == input.getId()){
			Map<String, String> map = new HashMap<>();
			map.put("code", "NO_ITEM_FOUND");
			map.put("message", "You are trying to update a non exisiting item");
			return new ResponseEntity<>(map, HttpStatus.BAD_REQUEST);
		}
		itemService.updateItem(input);
		return new ResponseEntity(HttpStatus.CREATED);
	}
}
