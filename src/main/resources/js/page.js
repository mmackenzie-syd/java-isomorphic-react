/*global document:false*/
import React from "react";
import {CurvedCarousel} from "curved-carousel";

export default React.createClass({
    getDefaultProps: function () {
        return {
            movies: [],
            curve: 50,
            friction: 0.95,
            rotation: true,
            spacing: 50
        };
    },
    getInitialState: function () {
        return {movies: this.props.movies};
    },
    render: function() {
        return (
            <div className="demo">
                <CurvedCarousel
                    childWidth={100}
                    curve={this.props.curve}
                    spacing={this.props.spacing}
                    rotation={this.props.rotation}
                    friction={this.props.friction}
                    style={{
                    height: 350}}>

                    {this.state.movies.map(function(movie, key){
                        var imageSrc = 'http://images2.vudu.com/poster2/'+movie.id+'-m';
                        var hrefUrl = 'http://www.vudu.com/movies/#!content/'+movie.id;
                        return <a key={key} href={hrefUrl}><img src={imageSrc}/></a>;
                    })}

                </CurvedCarousel>
            </div>
        );
    }
});