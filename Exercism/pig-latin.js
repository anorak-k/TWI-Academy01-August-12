//
// This is only a SKELETON file for the 'Pig Latin' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

export class translator {
  static translate(word) {
    return word.replace(/((?:[aeoiu]|xr|yt)\w*)|(?:(\w?qu|y|[^aueoiy ]+)(\w*))/gi, '$1$3$2ay');
  }
}
