package be.coworking.repositories;

import be.coworking.entities.Workstation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface WorkstationRepository extends JpaRepository<Workstation, UUID> {
}
