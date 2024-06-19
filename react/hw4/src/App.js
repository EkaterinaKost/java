import './App.css';
import { BrowserRouter as Router, Routes, Route, Link } from "react-router-dom"
import HomePage from './components/Home';
import AboutPage from './components/ubout';
//import List from './components/List';
function App() {
  <Router>
    <div>
      <nav>
        <ul>
          <li>
            <Link to="/">Главная страница</Link>
          </li>
          <li>
            <Link to="/about">Обо мне</Link>
          </li>
        </ul>
      </nav>
      <Routes>
        <Route path="/" element={<HomePage />} />
        <Route path="/about" element={<AboutPage />} />
      </Routes>
    </div>
  </Router>
  /*const liElement=[1,2,3,4,5,6,7]
  const renderItem= (item, index)=>{
    const style={color: index%2 === 0?'blue' : 'red'};
    return(
      <div style={style}>{item} - уникальный стиль
      </div>
    );
  };
  return (
    <div className="App">
      <h1>изучаем react</h1>
      <List listItems={liElement} renderItem={renderItem}/>
    </div>
  );*/
}

export default App;
