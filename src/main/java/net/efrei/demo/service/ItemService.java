package net.efrei.demo.service;

import net.efrei.demo.domain.Item;
import net.efrei.demo.repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository){
        this.itemRepository = itemRepository;
    }

    public List<Item> findAll(){return itemRepository.findAll();}
}
