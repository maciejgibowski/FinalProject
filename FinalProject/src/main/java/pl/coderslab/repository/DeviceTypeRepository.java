package pl.coderslab.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.coderslab.entity.DeviceType;

public interface DeviceTypeRepository  extends JpaRepository<DeviceType, Long> {


}
