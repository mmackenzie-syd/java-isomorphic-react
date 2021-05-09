import React from "react/addons";
import Page from "./page";

export default function (movies) {
    var moviesList = Java.from(movies);
    return React.renderToString(
        <Page movies={moviesList}/>
    );
};