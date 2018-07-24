//Here we define our thunk action
//Thunk action is just a function that returns another function

import { USER_LOGGED_IN } from "../types";
import api from "../api";

export const userLoggedIn = user => ({
  type: USER_LOGGED_IN,
  user
});

//This is the template that we're going to use throughout the app.
//Throughout almost all API requests
//We'll have API requests that return promises and then we'll get the data from this request
//and pass it along to the next action
export const login = credentials => dispatch =>
  api.user.login(credentials).then(user => dispatch(userLoggedIn(user)));

//userLoggedIn is a naming convention used for the redux action

//This is mosty what we're going to use thunk actions for
//Make API request, get data, then dispatch a redux action that will change by reducers
//the redux store.
//We'll use normalizer later to normalize data.
//But for now to keep it simpler, we'll leave as is
