package com.mtzz.api.application.mapper;

import com.mtzz.api.application.controller.DTO.request.AddressRequest;
import com.mtzz.api.application.entities.Address;
import com.mtzz.api.application.util.DataFormat;

public class AddressMapper extends DataFormat
{
    public static Address toAddress(AddressRequest request)
    {
        Address address = new Address();
        address.setAddressId(request.getId());
        address.setStreetAddress(name_format(request.getStreetAddress()));
        address.setCep(number_format(request.getCep()));
        address.setNumber(number_format(request.getNumber()));
        address.setCity(name_format(request.getCity()));
        return address;
    }
}
