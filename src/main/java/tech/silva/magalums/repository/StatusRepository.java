package tech.silva.magalums.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.silva.magalums.entity.Status;

public interface StatusRepository extends JpaRepository<Status, Long> {
}
