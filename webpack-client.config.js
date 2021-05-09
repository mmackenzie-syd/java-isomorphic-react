module.exports = {
  context: __dirname + "/src/main/resources/js",
  entry: "./app.js",
  output: {
    filename: "bundle.js",
    path: __dirname + "/src/main/resources/static"
  },
  module: {
    loaders: [
      {
        test: /\.js(x|)?$/,
        exclude: /node_modules/,
        loaders: ["babel-loader"]
      },
      {
        test: /\.styl$/,
        loader: "style-loader!css-loader!stylus-loader"
      },
      {
        test: /\.woff(2)?$/,
        loader: "url-loader?limit=10000&minetype=application/font-woff" },
      {
        test: /\.(ttf|eot|svg|png)$/,
        loader: "file-loader"
      }
    ]
  }
};
