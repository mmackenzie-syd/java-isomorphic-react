import React from "react/addons";
import Page from "./page";

const rootEl = document.querySelector(".js-content");

React.render(<Page movies={window.__state__}/>, rootEl);