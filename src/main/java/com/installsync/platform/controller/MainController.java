package com.installsync.platform.controller;

import com.installsync.platform.model.Company;
import com.installsync.platform.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/company")
public class MainController {
    @Autowired
    private CompanyRepository companyRepository;

    @PostMapping(path="/add")
    public @ResponseBody String addNewCompany (@RequestParam String name, @RequestParam String email) {
        Company n = new Company();
        n.setName(name);
        n.setEmail(email);
        companyRepository.save(n);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Company> getAllCompanies() {
        return companyRepository.findAll();
    }
}
