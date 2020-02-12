import React from 'react';
import './App.css';
import PrimeGenerator from "./component/PrimeGenerator";

function App() {
    return (
        <div className="container">
            <div className="row">
                <div className="col-md-8 offset-md-2">
                    <h4><span className="badge badge-secondary">React Frontend</span></h4>
                </div>
            </div>
            <PrimeGenerator/>
        </div>
    );
}

export default App;
