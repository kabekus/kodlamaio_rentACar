package com.kodlamaio.rentacar.business.concretes;

import com.kodlamaio.rentacar.business.abstracts.IBrandService;
import com.kodlamaio.rentacar.business.requests.CreateBrandRequest;
import com.kodlamaio.rentacar.business.responses.GetAllBrandsResponse;
import com.kodlamaio.rentacar.dataAccess.abstracts.IBrandRepository;
import com.kodlamaio.rentacar.entities.concrets.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class BrandManager implements IBrandService {
    private IBrandRepository brandRepository;

    @Autowired
    public BrandManager(IBrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<GetAllBrandsResponse> getAll() {
        List<Brand> brands = brandRepository.findAll();
        List<GetAllBrandsResponse> brandsResponses = new ArrayList<GetAllBrandsResponse>();

        for (Brand brand : brands) {
            GetAllBrandsResponse responseItem = new GetAllBrandsResponse();
            responseItem.setId(brand.getId());
            responseItem.setName(brand.getName());
            brandsResponses.add(responseItem);
        }
        return brandsResponses;
    }

    @Override
    public void add(CreateBrandRequest createBrandRequest) {
        Brand brand = new Brand();
        brand.setName(createBrandRequest.getName());
        this.brandRepository.save(brand);
    }
}
