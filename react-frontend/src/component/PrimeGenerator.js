import React from 'react'
import {baseUrl} from "../Globals";

/**
 * Url to the backend system
 */
const URL = baseUrl + '/probable-prime?bitLength=';

class PrimeGenerator extends React.Component {

    constructor(props) {
        super(props);
        this.state = {
            bitLength: "",
            prime: ""
        };

        this.handleChange = this.handleChange.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);
    }

    handleChange(event) {
        this.setState({bitLength: event.target.value});
    }

    handleSubmit(event) {
        this.randomPrimeFromBackend(this.state.bitLength);
        event.preventDefault();
    }

    randomPrimeFromBackend(bitLength) {
        fetch(URL + bitLength)
            .then(res => res.text())
            .then(data => {
                this.setState({
                    prime: data
                })
            })
            .catch(console.log)
    }

    render() {
        return (
            <div className="row">
                <div className="col-md-8 offset-md-2">
                    <h2>Prime Generator</h2>
                    <p>Requests a random number from the backend that is probable prime</p>
                    <form onSubmit={this.handleSubmit}>
                        <div>
                            <label htmlFor="bitLength">Bit Length:</label>
                            <input type="text" value={this.state.bitLength} onChange={this.handleChange} id="bitLength"
                                   className="form-control w-25" placeholder="32"/>
                        </div>
                        <div>
                            <label htmlFor="prime">Prime number:</label>
                            <textarea className="form-control" rows="5" id="prime" value={this.state.prime} readOnly/>
                        </div>
                        <br/>
                        <input type="submit" value="Request random prime" className="btn btn-primary"/>
                    </form>
                </div>
            </div>
        )
    }
}


export default PrimeGenerator
