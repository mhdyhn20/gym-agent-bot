# Rokh Fit 1.0.2

- Fixed the blank-screen failure path in the WebView.
- Removed large Base64/WebP blobs from the runtime HTML and moved the guide visuals to lightweight inline SVG.
- Removed optional chaining and nullish-coalescing syntax for better compatibility with older Android WebViews.
- Replaced newer object/array helpers used by the runtime with compatibility helpers.
- Added visible JS error fallback instead of a silent white screen.
- Switched the native Activity theme to the same dark background as the app UI.
- Improved WebView defaults and main-frame error feedback.
- Kept the exercise guide flow as ۱ شروع → ۲ اجرا → ۳ پایان, with active-phase highlighting.
- Bumped versionCode to 3 and versionName to 1.0.2.
