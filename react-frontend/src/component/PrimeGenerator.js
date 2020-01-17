import React from 'react'

class PrimeGenerator extends React.Component {
    constructor(props) {
        super(props);
        this.state = {bitLength: ""};

        this.handleChange = this.handleChange.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);
    }

    handleChange(event) {
        this.setState({bitLength: event.target.value});
    }

    handleSubmit(event) {
        alert("submitted bit length: " + this.state.bitLength);
    }

    render() {
        return (
            <div>
                <h2>Prime Generator</h2>
                <p>Requests a number from the backend that is probable prime</p>
                <textarea rows="4" readOnly>
                    No number so far...
                </textarea>
                <form onSubmit={this.handleSubmit}>
                    <label>
                        <input type="text" value={this.state.bitLength} onChange={this.handleChange}/>
                    </label>
                    <input type="submit" value="Random Prime"/>
                </form>
            </div>
        )
    }
}

export default PrimeGenerator
