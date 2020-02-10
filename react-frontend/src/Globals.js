const HOST_LOCAL = 'localhost';
// const HOST_SERVER = 'backend';
const PORT = '8080';
const RUN_API = '/api';

const REST_RUN_API_LOCAL = `//${HOST_LOCAL}:${PORT}${RUN_API}`;

//
// This is a method to use different urls based on the build mode environment variable. It is actually not used.
//
// const REST_RUN_API_SERVER = `//${HOST_SERVER}:${PORT}${RUN_API}`;
// export const baseUrl = process.env.NODE_ENV === 'development' ? REST_RUN_API_LOCAL : REST_RUN_API_SERVER;

export const baseUrl = REST_RUN_API_LOCAL;
