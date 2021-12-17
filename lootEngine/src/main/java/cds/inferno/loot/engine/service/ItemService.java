package cds.inferno.loot.engine.service;

import cds.inferno.loot.engine.dao.ItemDao;
import cds.inferno.loot.engine.dto.ItemDto;
import cds.inferno.loot.engine.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ItemService {

    @Autowired
    private ItemDao itemDao;
    @Autowired
    private ItemMapper mapper;

    public List<ItemDto> getAllItems(){
        List<Item> itemList = (List<Item>) itemDao.findAll();
        List<ItemDto> itemDtoList =
                itemList.stream()
                        .map(item -> mapper.fromEntity(item))
                        .collect(Collectors.toList());
        return itemDtoList;
    }

    public ItemDto findItemById(Long id){
        Optional<Item> optional = itemDao.findById(id);
        if(!optional.isPresent()){
            throw new IllegalArgumentException("No Item Found for this ID");
        }
        return mapper.fromEntity(optional.get());
    }

    public List<ItemDto> findSpecificItems(ItemDto dto){
        Item item = mapper.fromDto(dto);
        List<Item>itemList = itemDao.findSpecificItems(item);
        List<ItemDto>itemDtoList =
                itemList.stream()
                        .map(item1 -> mapper.fromEntity(item1))
                        .collect(Collectors.toList());
        return itemDtoList;
    }

    public void saveItem(ItemDto itemDto){
        Item item = mapper.fromDto(itemDto);
        itemDao.save(item);
    }

    public void updateItem(ItemDto itemDto){
        Item item = mapper.fromDto(itemDto);
        itemDao.save(item);
    }

    public void deleteItem(Long id){
        itemDao.deleteById(id);
    }
}
