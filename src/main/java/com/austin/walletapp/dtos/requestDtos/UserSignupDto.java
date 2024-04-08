package com.austin.walletapp.dtos.requestDtos;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserSignupDto {
    @NotNull
    @Schema(example = "Austin")
    private String firstName;

    @NotNull @Schema(example = "Igboke")
    private String lastName;

    @NotNull @Schema(example = "austin5astro@gmail.com")
    private String email;

    @NotNull @Schema(example = "Nigeria")
    private String country;

    @NotNull @Schema(example = "Enugu")
    private String state;

    @NotNull @Schema(example = "65B, Rail Estate, Okpara Avenue")
    private String homeAddress;

    @NotNull @Schema(example = "1234")
    private String password;

    @NotNull @Schema(example = "09063777946")
    private String phoneNumber;
}
