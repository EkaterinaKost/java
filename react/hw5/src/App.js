import React from "react";
import "./App.css";
import ThemeSwitcher from "./components/ThemeSwitcher";
import { Provider, useSelector } from "react-redux";
import store from "./redux/store";

function App() {
  const theme = useSelector((state) => state.theme); // Получаем текущую тему из Redux

  return (
    <Provider store={store}>
      <div className={`App ${theme}-theme`}>
      {" "}
      <header className="App-header">
        <ThemeSwitcher />
      </header>
    </div>
    </Provider>
    
  )
}

export default App;
