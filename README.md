# Nomen est Omen

_"Your name is your destiny"_, so be sure you pick a good name.
This Java library helps with generating some super-awesome random names
that you can use for some unique IDs :)

Generated names may consist of:

+ adjective (1400+)
+ animals (380+)
+ color name (80+)
+ nouns (850+)
+ person name (140+ names)
+ superb name (10+ names)
+ pokemon name (700+ names)
+ superheroes name (1800+ names)
+ count (any number > 0)

For example, you can get names such: `hungry_navy_babbage`
or `dreamy-cray`. Isn't this super great?

## Usage

It's complicated.

### 1. Add dependencies

View the latest version [here](https://github.com/vladimir-paskov/nomen-est-omen/packages/885498).

In your Gradle or Maven project, add:

    maven {
        url 'https://maven.pkg.github.com/vladimir-paskov/nomen-est-omen'
        credentials {
            username "your_github_user_name"
            password "your_personal_access_token"
        }
    }

    implementation 'com.vmsoft:nomen-est-omen:<version>'
    
You can learn more about acess tokens [here](https://docs.github.com/en/packages/working-with-a-github-packages-registry/working-with-the-gradle-registry#authenticating-to-github-packages).

### 2. Use it

If you just want a short name (adjective and person name):

	Nomen.randomName();

If you want to build your own template, e.g.:

	Nomen.est().adjective().color().person().get();

Variables are set using `withXxx()` methods:

	Nomen.est().adjective().color().person().withSpace('/').get();
	
That is all.

### 3. Optimise if you will

Templates can be created once:

	Nomen uigen = Nomen.est().adjective().person();
	...
	String id1 = uigen.get();
	String id2 = uigen.get();

Nice!

## Thanx to Igor Spasić

This repo is forked from [igr/nomen-est-omen](https://github.com/igr/nomen-est-omen), to make this random name generator compatible with Android API 16 and newer.
For more details see [Issue #1](https://github.com/vladimir-paskov/nomen-est-omen/issues/1)

## Thanx to Docker

I am blatantly stealing idea from [Docker](https://github.com/docker/docker/blob/master/pkg/namesgenerator/names-generator.go).
It is so beautiful, that it deserves Java port :)


## License

[BSD](LICENSE)
