package com.api_gestion_horas_extras.controller;

import com.api_gestion_horas_extras.entities.HoraExtra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import com.api_gestion_horas_extras.service.HoraExtraService;

import java.util.List;

@RestController
@RequestMapping("/api/horas-extras")
public class HoraExtraController {

    @Autowired
    private HoraExtraService service;

    @GetMapping
    public List<HoraExtra> listarHorasExtras() {
        return service.obtenerHorasExtras();
    }

    @PostMapping
    public HoraExtra registrarHoraExtra(@RequestBody HoraExtra horaExtra) {
        return service.registrarHoraExtra(horaExtra);
    }

}
