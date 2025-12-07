package in.mayankproj.billingsoftware.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import in.mayankproj.billingsoftware.io.ItemRequest;
import in.mayankproj.billingsoftware.io.ItemResponse;

public interface ItemService {
    

    ItemResponse add(ItemRequest request, MultipartFile file );

    List<ItemResponse> fetchItems();

    void deleteItem(String itemId);
    
}
