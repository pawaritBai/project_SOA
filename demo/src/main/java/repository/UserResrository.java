package repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.User;

@Repository
public interface UserResrository extends JpaRepository<User, Integer> {
    // สามารถเพิ่ม Query Method ได้ เช่น findByUserId
}
