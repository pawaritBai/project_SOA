package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Outfit;

@Repository
public interface OutfitRespository extends JpaRepository<Outfit, Integer> {
    // สามารถเพิ่ม Query Method ได้ เช่น findByUserId
}
