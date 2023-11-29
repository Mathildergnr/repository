package net.efrei.demo.web.rest;

import net.efrei.demo.domain.Item;
import net.efrei.demo.service.ItemService;

import net.efrei.demo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ItemRessource {
    public final ItemService itemService;
    public ItemRessource(ItemService itemService){
        this.itemService = itemService;
    }
    @GetMapping("/items")
    public List<Item> getAllItems(){return itemService.findAll();}
    @GetMapping("/items/{id}")
    public Item getItem(@PathVariable String id){
        Item item = new Item();
        item.setName("Pierre");
        return item;
    }
}