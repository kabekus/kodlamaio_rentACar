package com.kodlamaio.rentacar.webApi.controllers;

import com.kodlamaio.rentacar.business.abstracts.IBrandService;
import com.kodlamaio.rentacar.business.requests.CreateBrandRequest;
import com.kodlamaio.rentacar.business.responses.GetAllBrandsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/brands")
public class BrandsController {
    private IBrandService brandService;

    @Autowired
    public BrandsController(IBrandService brandService) {
        this.brandService = brandService;
    }

    @GetMapping("/getAll")
    public List<GetAllBrandsResponse> getAll(){
        return brandService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody() CreateBrandRequest createBrandRequest){
     this.brandService.add(createBrandRequest);
    }
}
