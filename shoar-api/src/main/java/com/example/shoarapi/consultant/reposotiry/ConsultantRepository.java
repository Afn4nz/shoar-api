package com.example.shoarapi.consultant.reposotiry;

import com.example.shoarapi.consultant.entity.Consultant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ConsultantRepository extends JpaRepository<Consultant, Long> {
    List<Consultant> findAllByCategory_NameEn(String category);
}
