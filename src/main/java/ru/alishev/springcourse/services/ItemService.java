package ru.alishev.springcourse.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.alishev.springcourse.models.Item;
import ru.alishev.springcourse.models.Person;
import ru.alishev.springcourse.repositories.ItemsRepository;

import java.util.List;

@Service
@Transactional
public class ItemService {

    public final ItemsRepository itemsRepository;

    @Autowired
    public ItemService(ItemsRepository itemRepository) {
        this.itemsRepository = itemRepository;
    }

    public List<Item> findByItemName(String itemName) {
        return itemsRepository.findByItemName(itemName);
    }

    public List<Item> findByOwner(Person owner) {
        return itemsRepository.findByOwner(owner);
    }


}
