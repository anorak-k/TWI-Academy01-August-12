//
// This is only a SKELETON file for the 'Pig Latin' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

export class translator {
  static translate(phrase) {
    return phrase.split(' ').map(word => this.translateWord(word)).join(' ');
  }

  static translateWord(word) {
    const VOWELS = ['a', 'e', 'i', 'o', 'u'];
    const VOWEL_SOUNDS = ['xr', 'yt'];
    var yIndex;
    var yIsAVowelFlag = false;

    if(VOWELS.includes(word[0]) || VOWEL_SOUNDS.includes(word.substr(0,2)))
      return word + "ay";

    for(var letterIndex = 0; letterIndex < word.length ;letterIndex++)
    {
      if(VOWELS.includes(word[letterIndex]))
      {
        if(word[letterIndex] == 'u' && word[letterIndex-1] == 'q')
          letterIndex++;
        word= word.substr(letterIndex) + word.substr(0, letterIndex);
        break;
      }
      if(letterIndex == word.length-1)
      {
        yIndex = word.indexOf('y');
        word = word.substr(yIndex) + word.substr(0, yIndex);
        yIsAVowelFlag = true;
        break;
      }
    }

    if(VOWELS.includes(word[0]) || VOWEL_SOUNDS.includes(word.substr(0,2)) || yIsAVowelFlag)
      return word + "ay";

  }
}
