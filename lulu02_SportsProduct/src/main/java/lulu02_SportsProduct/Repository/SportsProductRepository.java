package lulu02_SportsProduct.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lulu02_SportsProduct.Entity.PurchaseEntity;

@Repository
public interface SportsProductRepository extends JpaRepository<PurchaseEntity, Integer>{

}
