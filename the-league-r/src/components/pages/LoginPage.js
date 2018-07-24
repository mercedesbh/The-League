import React from "react";
import propTypes from "prop-types";
import { connect } from "react-redux";
import LoginForm from "../forms/LoginForm";
import { login } from "../../actions/auth";

class LoginPage extends React.Component {
  submit = data =>
    this.props.login(data).then(() => this.props.history.push("/"));

  render() {
    return (
      <div>
        <h1>LoginPage</h1>

        <LoginForm submit={this.submit} />
      </div>
    );
  }
}

LoginPage.propTypes = {
  //It expects history object with push method on it
  history: propTypes.shape({
    push: propTypes.func.isRequired
  }).isRequired,
  login: propTypes.func.isRequired
};

//First parameter maps state to props and allows us to pass data from redux state into this component
//Second parameter is to map the page to prop. We wrap the function in this page. Just provide object
//with the functions that we want to wrap in this page call
export default connect(
  null,
  { login }
)(LoginPage);
