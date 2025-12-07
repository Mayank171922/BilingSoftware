package in.mayankproj.billingsoftware.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import in.mayankproj.billingsoftware.entity.ItemEntity;

public interface ItemRepository extends JpaRepository<ItemEntity, Long> {
    Optional<ItemEntity> findByItemId(String id);

    Integer countByCategoryId(Long Id);

    
}
