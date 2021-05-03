package pl.turnip.spring.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.turnip.spring.model.Policy;
import pl.turnip.spring.service.PolicyService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PolicyController {

    private final PolicyService policyService;

    @GetMapping("/policies")
    public List<Policy> getPolicies() {
        return policyService.getAll();
    }

    @GetMapping("/policies/{id}")
    public Policy getPolicyById(@PathVariable Integer id) {
        return policyService.getById(id);
    }
}
