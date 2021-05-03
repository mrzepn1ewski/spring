package pl.turnip.spring.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.turnip.spring.model.Policy;
import pl.turnip.spring.model.exception.PolicyNotFoundException;
import pl.turnip.spring.repository.PolicyRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PolicyService {

    private final PolicyRepository policyRepository;

    public List<Policy> getAll() {
        return this.policyRepository.findAll();
    }

    public Policy getById(Integer id) {
        return this.policyRepository.findById(id)
                .orElseThrow(PolicyNotFoundException::new);
    }
}
