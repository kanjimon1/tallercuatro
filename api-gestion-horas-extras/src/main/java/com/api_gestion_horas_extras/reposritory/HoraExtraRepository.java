package com.api_gestion_horas_extras.reposritory;

import com.api_gestion_horas_extras.entities.HoraExtra;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface HoraExtraRepository  extends JpaRepository<HoraExtra, Long>{


}
