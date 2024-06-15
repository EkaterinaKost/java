
import { useState } from "react";
import { TextField, Button } from "@mui/material";
import "./TemperatureConverterStyles.css";

const TemperatureConverter = () => {
  const [celsius, setCelsius] = useState("");
  const [fahrenheit, setFahrenheit] = useState("");

  const convertToCelsius = (f) => {
    const c = (parseFloat(f) - 32) * (5 / 9);
    setCelsius(c.toFixed(2));
  };

  const convertToFahrenheit = (c) => {
    const f = (parseFloat(c) * 9) / 5 + 32;
    setFahrenheit(f.toFixed(2));
  };

  const handleCelsiusChange = (event) => {
    const { value } = event.target;
    setCelsius(value);
    convertToFahrenheit(value);
  };

  const handleFahrenheitChange = (event) => {
    const { value } = event.target;
    setFahrenheit(value);
    convertToCelsius(value);
  };

  return (
    <div className="temperature-converter">
      <TextField
        className="temperature-input"
        label="Celsius"
        value={celsius}
        onChange={handleCelsiusChange}
      />
      <TextField
        className="temperature-input"
        label="Fahrenheit"
        value={fahrenheit}
        onChange={handleFahrenheitChange}
      />
      <Button 
        variant="outlined"
        onClick={() => {
          setCelsius("");
          setFahrenheit("");
        }}
      >
        Clear
      </Button>
    </div>
  );
};

export default TemperatureConverter;