import logo from './logo.svg';
import './App.css';
import Message from './components/Message';

const someTitle = "Заголовок";
const someText =
  "Задача организации, в особенности же укрепление и развитие структуры обеспечивает широкому кругу (специалистов) участие в формировании новых предложений. Разнообразный и богатый опыт реализация намеченных плановых заданий требуют от нас анализа систем массового участия. Значимость этих проблем настолько очевидна, что сложившаяся структура организации представляет собой интересный эксперимент проверки форм развития. Задача организации, в особенности же постоянный количественный рост и сфера нашей активности играет важную роль в формировании новых предложений. Значимость этих проблем настолько очевидна, что начало повседневной работы по формированию позиции обеспечивает широкому кругу (специалистов) участие в формировании системы обучения кадров, соответствует насущным потребностям";



function App() {
  return <Message title={someTitle} text={someText} />;
}

export default App;
