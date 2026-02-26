package com.wdrmaintronic.dto.request;

import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CNPJ;

public record CreateSupplierRequest(
        @NotBlank
        String companyName,

        @NotBlank @CNPJ
        String cnpj
) { }