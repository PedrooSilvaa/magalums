package tech.silva.magalums.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_channel")
public class Channel {

    @Id
    private Long channelId;

    private String description;

    public Channel(Long channelId, String description) {
        this.channelId = channelId;
        this.description = description;
    }

    public Channel() {
    }

    public Long getChannelId() {
        return channelId;
    }

    public void setChannelId(Long channelId) {
        this.channelId = channelId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
