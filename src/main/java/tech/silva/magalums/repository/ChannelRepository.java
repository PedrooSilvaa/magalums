package tech.silva.magalums.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.silva.magalums.entity.Channel;

public interface ChannelRepository extends JpaRepository<Channel, Long> {
}
