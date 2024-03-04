package com.example.shoarapi.consultant;

import com.example.shoarapi.consultant.entity.Consultant;
import com.example.shoarapi.consultant.reposotiry.ConsultantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ConsultantService {
    private final ConsultantRepository consultantRepository;
    public List<Consultant> getConsultantsByCategory(String category){
        return consultantRepository.findAllByCategory_NameEn(category);
    }
}
