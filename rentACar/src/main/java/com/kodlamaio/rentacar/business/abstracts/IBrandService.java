package com.kodlamaio.rentacar.business.abstracts;

import com.kodlamaio.rentacar.business.requests.CreateBrandRequest;
import com.kodlamaio.rentacar.business.responses.GetAllBrandsResponse;
import java.util.List;

public interface IBrandService {
    List<GetAllBrandsResponse> getAll();
    void add(CreateBrandRequest createBrandRequest);
}
