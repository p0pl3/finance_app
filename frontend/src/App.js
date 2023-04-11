import './App.css';
import {BrowserRouter, Routes, Route} from "react-router-dom";
import MainPage from "./pages/MainPage";
import Category from "./pages/Category";

function App() {
    return (
        <BrowserRouter>
            <Routes>
                <Route path='/home' element={<MainPage/>}/>
                <Route path='/category' element={<Category/>}/>
            </Routes>
        </BrowserRouter>
    );
}

export default App;
