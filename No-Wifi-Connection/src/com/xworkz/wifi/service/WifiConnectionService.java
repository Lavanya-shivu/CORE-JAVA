package com.xworkz.wifi.service;

import com.xworkz.wifi.dto.WifiDto;
import com.xworkz.wifi.exception.NoWifiConnectionException;

public interface WifiConnectionService {
    boolean checkConnection(WifiDto wifiDto) throws NoWifiConnectionException;
}
