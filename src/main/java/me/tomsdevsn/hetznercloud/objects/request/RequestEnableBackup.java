package me.tomsdevsn.hetznercloud.objects.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class RequestEnableBackup {

    @JsonProperty("backup_window")
    public String backupWindow;
}