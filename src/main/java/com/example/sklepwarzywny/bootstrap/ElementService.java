package com.example.sklepwarzywny.bootstrap;
import com.example.sklepwarzywny.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ElementService {

    private BootstrapRepository bootstrapRepository;

    @Autowired
    public ElementService(BootstrapRepository bootstrapRepository) {

        this.bootstrapRepository = bootstrapRepository;
    }

    BootstrapElement add(BootstrapElement element) {
        return bootstrapRepository.save(element);

    }
    List<BootstrapElement> getAll() {
        return Utils.toList(
                bootstrapRepository.findAll());

    }
    void remove(Long id) {
        Optional<BootstrapElement> element = bootstrapRepository.findById(id);
        if(element.isPresent()) {
            BootstrapElement elementToDelete = element.get();
            bootstrapRepository.delete(elementToDelete);
        }
    }
}
