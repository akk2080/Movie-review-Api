import logo from './logo.svg';

import './App.css';
import { useState, useEffect } from 'react';

import apiClient from './api/apiConfig';

function App() {

  const [movies, setMovies] = useState();

  const getMovies = async () => {

    try{

      const response = await apiClient.get("/movies");

      console.log(response.data);

      setMovies(response.data);

    }
    catch(error){
      console.log(error);
    }
    
  }


  useEffect(() =>{
    getMovies();

  }, []) 



  return (
    <div className="App">
     
    </div>
  );
}

export default App;
