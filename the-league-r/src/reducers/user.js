//Reducer is just a function that takes state and actions and returns new state
import { USER_LOGGED_IN } from "../types";

//The boilerplate
export default function user(state = {}, action = {}) {
  switch (action.type) {
    case USER_LOGGED_IN:
      return action.user;
    default:
      return state;
  }
}
