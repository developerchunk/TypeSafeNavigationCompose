# TypeSafeNavigation with Jetpack Compose

Welcome to the **TypeSafeNavigation** library, an updated approach to handling navigation in Jetpack Compose. This library eliminates the need for string values and argument passing in routes, making your navigation code more robust and easier to maintain.

## Overview

In the new **Type Safe Navigation**, we are not using string values as our routes in the navigation. Instead, we create:

- **Serializable Objects** for each screen without arguments.
- **Serializable Data Classes** for each screen with arguments.

This approach ensures type safety throughout your navigation flow, reducing the likelihood of runtime errors and making your codebase more maintainable.

## Why Type Safe Navigation?

Using strings for routes and argument passing is prone to errors and can become cumbersome as your application grows. By adopting a type-safe approach, you gain several benefits:

- **Compile-time safety:** Catch errors related to navigation at compile time rather than runtime.
- **Improved code readability:** Navigation becomes clearer and more structured.
- **Ease of refactoring:** Changing navigation routes or arguments is simpler and safer.

## How to Use

To implement type-safe navigation in your Jetpack Compose project, follow these steps:

1. **Define your screens:**
    - For screens with no arguments, create a serializable object.
    - For screens with arguments, define a serializable data class.

    ```kotlin
    // Example of a screen without arguments
    object HomeScreen : Serializable

    // Example of a screen with arguments
    data class DetailsScreen(val itemId: String) : Serializable
    ```

2. **Set up your navigation graph:**
    - Use these objects and classes directly in your navigation graph.

    ```kotlin
    composable(route = HomeScreen::class) {
        // Screen content here
    }

    composable(route = DetailsScreen::class) { backStackEntry ->
        val itemId = backStackEntry.arguments?.getString("itemId")
        // Screen content here
    }
    ```

## Example Project

You can find a full example in the project - 'navigation' and 'screens' packages, demonstrating how to set up and use type-safe navigation in a Jetpack Compose application.

## Learn More

For an in-depth explanation of Type Safe Navigation and how to implement it in your projects, check out this [Medium article](https://medium.com/@developerchunk/introducing-type-safe-navigation-in-jetpack-compose-9563b2322243).

## Contributing

Contributions are welcome! Please open an issue or submit a pull request if you have any suggestions or improvements.

---

Feel free to modify this template to better fit your specific needs!
