const evaporator = (content, evap_per_day, threshold) => Math.ceil((Math.log(threshold / 100)) / (Math.log(1 - (evap_per_day / 100))));
