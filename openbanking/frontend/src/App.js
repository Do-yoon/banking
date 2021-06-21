import logo from './logo.svg';
import './App.css';
import Login from './pages/Login.js'
import Footer from './components/Footer.js'
import Header from './components/Header.js'

function App() {
  return (
      <div className="App">
          <div>
              <Header />
          </div>
          <div>
              <Login className="Login"/>
          </div>
          <div >
              <Footer />
          </div >
      </div>
  );
}

export default App;
